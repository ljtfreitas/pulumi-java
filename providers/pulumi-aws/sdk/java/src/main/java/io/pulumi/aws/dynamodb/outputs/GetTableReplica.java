// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTableReplica {
    private final String kmsKeyArn;
    private final String regionName;

    @OutputCustomType.Constructor({"kmsKeyArn","regionName"})
    private GetTableReplica(
        String kmsKeyArn,
        String regionName) {
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
        this.regionName = Objects.requireNonNull(regionName);
    }

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyArn;
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.regionName = defaults.regionName;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public GetTableReplica build() {
            return new GetTableReplica(kmsKeyArn, regionName);
        }
    }
}
