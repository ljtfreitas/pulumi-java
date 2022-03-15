// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupIngressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityGroupIngressGetArgs Empty = new SecurityGroupIngressGetArgs();

    /**
     * The CIDR block to accept
     * 
     */
    @Import(name="cidr")
      private final @Nullable Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr == null ? Output.empty() : this.cidr;
    }

    /**
     * The name of the security group to authorize
     * 
     */
    @Import(name="securityGroupName")
      private final @Nullable Output<String> securityGroupName;

    public Output<String> getSecurityGroupName() {
        return this.securityGroupName == null ? Output.empty() : this.securityGroupName;
    }

    /**
     * The owner Id of the security group provided
     * by `security_group_name`.
     * 
     */
    @Import(name="securityGroupOwnerId")
      private final @Nullable Output<String> securityGroupOwnerId;

    public Output<String> getSecurityGroupOwnerId() {
        return this.securityGroupOwnerId == null ? Output.empty() : this.securityGroupOwnerId;
    }

    public SecurityGroupIngressGetArgs(
        @Nullable Output<String> cidr,
        @Nullable Output<String> securityGroupName,
        @Nullable Output<String> securityGroupOwnerId) {
        this.cidr = cidr;
        this.securityGroupName = securityGroupName;
        this.securityGroupOwnerId = securityGroupOwnerId;
    }

    private SecurityGroupIngressGetArgs() {
        this.cidr = Output.empty();
        this.securityGroupName = Output.empty();
        this.securityGroupOwnerId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupIngressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidr;
        private @Nullable Output<String> securityGroupName;
        private @Nullable Output<String> securityGroupOwnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupIngressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.securityGroupOwnerId = defaults.securityGroupOwnerId;
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder cidr(@Nullable String cidr) {
            this.cidr = Output.ofNullable(cidr);
            return this;
        }

        public Builder securityGroupName(@Nullable Output<String> securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        public Builder securityGroupName(@Nullable String securityGroupName) {
            this.securityGroupName = Output.ofNullable(securityGroupName);
            return this;
        }

        public Builder securityGroupOwnerId(@Nullable Output<String> securityGroupOwnerId) {
            this.securityGroupOwnerId = securityGroupOwnerId;
            return this;
        }

        public Builder securityGroupOwnerId(@Nullable String securityGroupOwnerId) {
            this.securityGroupOwnerId = Output.ofNullable(securityGroupOwnerId);
            return this;
        }
        public SecurityGroupIngressGetArgs build() {
            return new SecurityGroupIngressGetArgs(cidr, securityGroupName, securityGroupOwnerId);
        }
    }
}
