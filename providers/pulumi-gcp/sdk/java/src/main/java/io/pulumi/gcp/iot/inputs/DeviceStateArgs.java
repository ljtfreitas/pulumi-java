// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceStateArgs Empty = new DeviceStateArgs();

    @Import(name="binaryData")
      private final @Nullable Output<String> binaryData;

    public Output<String> getBinaryData() {
        return this.binaryData == null ? Output.empty() : this.binaryData;
    }

    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public DeviceStateArgs(
        @Nullable Output<String> binaryData,
        @Nullable Output<String> updateTime) {
        this.binaryData = binaryData;
        this.updateTime = updateTime;
    }

    private DeviceStateArgs() {
        this.binaryData = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> binaryData;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder binaryData(@Nullable Output<String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        public Builder binaryData(@Nullable String binaryData) {
            this.binaryData = Output.ofNullable(binaryData);
            return this;
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public DeviceStateArgs build() {
            return new DeviceStateArgs(binaryData, updateTime);
        }
    }
}
