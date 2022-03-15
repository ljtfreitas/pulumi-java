// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableReplica {
    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * Region name of the replica.
     * 
     */
    private final String regionName;

    @CustomType.Constructor
    private TableReplica(
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("regionName") String regionName) {
        this.kmsKeyArn = kmsKeyArn;
        this.regionName = regionName;
    }

    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * Region name of the replica.
     * 
    */
    public String getRegionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TableReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.regionName = defaults.regionName;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public TableReplica build() {
            return new TableReplica(kmsKeyArn, regionName);
        }
    }
}
