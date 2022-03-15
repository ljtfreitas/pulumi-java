// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class OpenZfsVolumeUserAndGroupQuotaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsVolumeUserAndGroupQuotaGetArgs Empty = new OpenZfsVolumeUserAndGroupQuotaGetArgs();

    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
     */
    @Import(name="id", required=true)
      private final Output<Integer> id;

    public Output<Integer> getId() {
        return this.id;
    }

    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    @Import(name="storageCapacityQuotaGib", required=true)
      private final Output<Integer> storageCapacityQuotaGib;

    public Output<Integer> getStorageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public OpenZfsVolumeUserAndGroupQuotaGetArgs(
        Output<Integer> id,
        Output<Integer> storageCapacityQuotaGib,
        Output<String> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib, "expected parameter 'storageCapacityQuotaGib' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OpenZfsVolumeUserAndGroupQuotaGetArgs() {
        this.id = Output.empty();
        this.storageCapacityQuotaGib = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeUserAndGroupQuotaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> id;
        private Output<Integer> storageCapacityQuotaGib;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeUserAndGroupQuotaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storageCapacityQuotaGib = defaults.storageCapacityQuotaGib;
    	      this.type = defaults.type;
        }

        public Builder id(Output<Integer> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(Integer id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder storageCapacityQuotaGib(Output<Integer> storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib);
            return this;
        }

        public Builder storageCapacityQuotaGib(Integer storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Output.of(Objects.requireNonNull(storageCapacityQuotaGib));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public OpenZfsVolumeUserAndGroupQuotaGetArgs build() {
            return new OpenZfsVolumeUserAndGroupQuotaGetArgs(id, storageCapacityQuotaGib, type);
        }
    }
}
