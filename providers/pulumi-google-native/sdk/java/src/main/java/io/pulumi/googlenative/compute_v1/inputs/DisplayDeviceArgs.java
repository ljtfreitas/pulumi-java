// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Display Device options
 * 
 */
public final class DisplayDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DisplayDeviceArgs Empty = new DisplayDeviceArgs();

    /**
     * Defines whether the instance has Display enabled.
     * 
     */
    @InputImport(name="enableDisplay")
      private final @Nullable Input<Boolean> enableDisplay;

    public Input<Boolean> getEnableDisplay() {
        return this.enableDisplay == null ? Input.empty() : this.enableDisplay;
    }

    public DisplayDeviceArgs(@Nullable Input<Boolean> enableDisplay) {
        this.enableDisplay = enableDisplay;
    }

    private DisplayDeviceArgs() {
        this.enableDisplay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDisplay;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDisplay = defaults.enableDisplay;
        }

        public Builder setEnableDisplay(@Nullable Input<Boolean> enableDisplay) {
            this.enableDisplay = enableDisplay;
            return this;
        }

        public Builder setEnableDisplay(@Nullable Boolean enableDisplay) {
            this.enableDisplay = Input.ofNullable(enableDisplay);
            return this;
        }
        public DisplayDeviceArgs build() {
            return new DisplayDeviceArgs(enableDisplay);
        }
    }
}
