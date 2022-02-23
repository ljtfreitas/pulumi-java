// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MultiRegionAccessPointDetailsRegion {
    /**
     * The name of the associated bucket for the Region.
     * 
     */
    private final String bucket;

    @OutputCustomType.Constructor({"bucket"})
    private MultiRegionAccessPointDetailsRegion(String bucket) {
        this.bucket = Objects.requireNonNull(bucket);
    }

    /**
     * The name of the associated bucket for the Region.
     * 
     */
    public String getBucket() {
        return this.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public MultiRegionAccessPointDetailsRegion build() {
            return new MultiRegionAccessPointDetailsRegion(bucket);
        }
    }
}
