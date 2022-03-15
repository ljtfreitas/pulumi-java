// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationRootPolicyTypeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationRootPolicyTypeGetArgs Empty = new OrganizationRootPolicyTypeGetArgs();

    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public OrganizationRootPolicyTypeGetArgs(
        @Nullable Output<String> status,
        @Nullable Output<String> type) {
        this.status = status;
        this.type = type;
    }

    private OrganizationRootPolicyTypeGetArgs() {
        this.status = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRootPolicyTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> status;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationRootPolicyTypeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
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
        public OrganizationRootPolicyTypeGetArgs build() {
            return new OrganizationRootPolicyTypeGetArgs(status, type);
        }
    }
}
