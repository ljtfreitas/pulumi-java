// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Describes any options that have an effect on the debugging of pipelines.
 * 
 */
public final class DebugOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DebugOptionsResponse Empty = new DebugOptionsResponse();

    /**
     * When true, enables the logging of the literal hot key to the user's Cloud Logging.
     * 
     */
    @InputImport(name="enableHotKeyLogging", required=true)
      private final Boolean enableHotKeyLogging;

    public Boolean getEnableHotKeyLogging() {
        return this.enableHotKeyLogging;
    }

    public DebugOptionsResponse(Boolean enableHotKeyLogging) {
        this.enableHotKeyLogging = Objects.requireNonNull(enableHotKeyLogging, "expected parameter 'enableHotKeyLogging' to be non-null");
    }

    private DebugOptionsResponse() {
        this.enableHotKeyLogging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableHotKeyLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHotKeyLogging = defaults.enableHotKeyLogging;
        }

        public Builder setEnableHotKeyLogging(Boolean enableHotKeyLogging) {
            this.enableHotKeyLogging = Objects.requireNonNull(enableHotKeyLogging);
            return this;
        }
        public DebugOptionsResponse build() {
            return new DebugOptionsResponse(enableHotKeyLogging);
        }
    }
}
