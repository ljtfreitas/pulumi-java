// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTypeInstanceDisk extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypeInstanceDisk Empty = new GetInstanceTypeInstanceDisk();

    @Import(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    @Import(name="size", required=true)
      private final Integer size;

    public Integer getSize() {
        return this.size;
    }

    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetInstanceTypeInstanceDisk(
        Integer count,
        Integer size,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetInstanceTypeInstanceDisk() {
        this.count = null;
        this.size = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeInstanceDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Integer size;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeInstanceDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceTypeInstanceDisk build() {
            return new GetInstanceTypeInstanceDisk(count, size, type);
        }
    }
}
