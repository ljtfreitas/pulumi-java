// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class DisplayDeviceResponse {
    /**
     * Defines whether the instance has Display enabled.
     * 
     */
    private final Boolean enableDisplay;

    @OutputCustomType.Constructor({"enableDisplay"})
    private DisplayDeviceResponse(Boolean enableDisplay) {
        this.enableDisplay = Objects.requireNonNull(enableDisplay);
    }

    /**
     * Defines whether the instance has Display enabled.
     * 
     */
    public Boolean getEnableDisplay() {
        return this.enableDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayDeviceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableDisplay;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayDeviceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDisplay = defaults.enableDisplay;
        }

        public Builder setEnableDisplay(Boolean enableDisplay) {
            this.enableDisplay = Objects.requireNonNull(enableDisplay);
            return this;
        }
        public DisplayDeviceResponse build() {
            return new DisplayDeviceResponse(enableDisplay);
        }
    }
}
