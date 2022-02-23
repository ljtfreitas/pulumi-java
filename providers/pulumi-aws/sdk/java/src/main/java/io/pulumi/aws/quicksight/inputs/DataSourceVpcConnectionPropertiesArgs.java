// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceVpcConnectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceVpcConnectionPropertiesArgs Empty = new DataSourceVpcConnectionPropertiesArgs();

    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     * 
     */
    @InputImport(name="vpcConnectionArn", required=true)
    private final Input<String> vpcConnectionArn;

    public Input<String> getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    public DataSourceVpcConnectionPropertiesArgs(Input<String> vpcConnectionArn) {
        this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
    }

    private DataSourceVpcConnectionPropertiesArgs() {
        this.vpcConnectionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceVpcConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> vpcConnectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceVpcConnectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcConnectionArn = defaults.vpcConnectionArn;
        }

        public Builder setVpcConnectionArn(Input<String> vpcConnectionArn) {
            this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn);
            return this;
        }

        public Builder setVpcConnectionArn(String vpcConnectionArn) {
            this.vpcConnectionArn = Input.of(Objects.requireNonNull(vpcConnectionArn));
            return this;
        }
        public DataSourceVpcConnectionPropertiesArgs build() {
            return new DataSourceVpcConnectionPropertiesArgs(vpcConnectionArn);
        }
    }
}
