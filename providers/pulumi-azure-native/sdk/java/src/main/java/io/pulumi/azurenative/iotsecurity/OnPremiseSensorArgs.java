// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OnPremiseSensorArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnPremiseSensorArgs Empty = new OnPremiseSensorArgs();

    /**
     * Name of the on-premise IoT sensor
     * 
     */
    @Import(name="onPremiseSensorName")
      private final @Nullable Output<String> onPremiseSensorName;

    public Output<String> getOnPremiseSensorName() {
        return this.onPremiseSensorName == null ? Output.empty() : this.onPremiseSensorName;
    }

    public OnPremiseSensorArgs(@Nullable Output<String> onPremiseSensorName) {
        this.onPremiseSensorName = onPremiseSensorName;
    }

    private OnPremiseSensorArgs() {
        this.onPremiseSensorName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseSensorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> onPremiseSensorName;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseSensorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onPremiseSensorName = defaults.onPremiseSensorName;
        }

        public Builder onPremiseSensorName(@Nullable Output<String> onPremiseSensorName) {
            this.onPremiseSensorName = onPremiseSensorName;
            return this;
        }

        public Builder onPremiseSensorName(@Nullable String onPremiseSensorName) {
            this.onPremiseSensorName = Output.ofNullable(onPremiseSensorName);
            return this;
        }
        public OnPremiseSensorArgs build() {
            return new OnPremiseSensorArgs(onPremiseSensorName);
        }
    }
}
