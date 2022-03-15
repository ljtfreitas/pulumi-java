// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageBootDiskInitializeParamsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageBootDiskInitializeParamsGetArgs Empty = new InstanceFromMachineImageBootDiskInitializeParamsGetArgs();

    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    @Import(name="labels")
      private final @Nullable Output<Map<String,Object>> labels;

    public Output<Map<String,Object>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public InstanceFromMachineImageBootDiskInitializeParamsGetArgs(
        @Nullable Output<String> image,
        @Nullable Output<Map<String,Object>> labels,
        @Nullable Output<Integer> size,
        @Nullable Output<String> type) {
        this.image = image;
        this.labels = labels;
        this.size = size;
        this.type = type;
    }

    private InstanceFromMachineImageBootDiskInitializeParamsGetArgs() {
        this.image = Output.empty();
        this.labels = Output.empty();
        this.size = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageBootDiskInitializeParamsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> image;
        private @Nullable Output<Map<String,Object>> labels;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageBootDiskInitializeParamsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable Integer size) {
            this.size = Output.ofNullable(size);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public InstanceFromMachineImageBootDiskInitializeParamsGetArgs build() {
            return new InstanceFromMachineImageBootDiskInitializeParamsGetArgs(image, labels, size, type);
        }
    }
}
