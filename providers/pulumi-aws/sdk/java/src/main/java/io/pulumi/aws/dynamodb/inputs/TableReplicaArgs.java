// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableReplicaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableReplicaArgs Empty = new TableReplicaArgs();

    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    @InputImport(name="kmsKeyArn")
    private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * Region name of the replica.
     * 
     */
    @InputImport(name="regionName", required=true)
    private final Input<String> regionName;

    public Input<String> getRegionName() {
        return this.regionName;
    }

    public TableReplicaArgs(
        @Nullable Input<String> kmsKeyArn,
        Input<String> regionName) {
        this.kmsKeyArn = kmsKeyArn;
        this.regionName = Objects.requireNonNull(regionName, "expected parameter 'regionName' to be non-null");
    }

    private TableReplicaArgs() {
        this.kmsKeyArn = Input.empty();
        this.regionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyArn;
        private Input<String> regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TableReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.regionName = defaults.regionName;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setRegionName(Input<String> regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = Input.of(Objects.requireNonNull(regionName));
            return this;
        }
        public TableReplicaArgs build() {
            return new TableReplicaArgs(kmsKeyArn, regionName);
        }
    }
}
