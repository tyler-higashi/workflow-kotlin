package com.squareup.workflow1

/**
 * Configuration parameters for the Workflow Runtime.
 *
 * @param processMultipleActions: Whether or not the runtime should process as many actions as it
 * can before providing the next rendering.
 * @param frameTimeoutMs: How long before the next rendering should be provided if
 * [processMultipleActions] is true.
 * Some research has shown touch events need 100ms latency on mobile, we want to be sure to be
 * less than that - what exactly this should be though is not clear.
 * TODO (https://github.com/square/workflow-kotlin/issues/810): fine-tune this value, or
 * hook up to a frame clock.
 */
public data class RuntimeConfig(
  public val processMultipleActions: Boolean = false,
  public val frameTimeoutMs: Long = 30L
) {

  public companion object {
    public val DEFAULT_CONFIG: RuntimeConfig = RuntimeConfig()
  }
}
