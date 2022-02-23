// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationNonMasterAccount extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationNonMasterAccount Empty = new GetOrganizationNonMasterAccount();

    /**
     * ARN of the root
     * 
     */
    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Email of the account
     * 
     */
    @InputImport(name="email", required=true)
    private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * Identifier of the root
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the policy type
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public GetOrganizationNonMasterAccount(
        String arn,
        String email,
        String id,
        String name,
        String status) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private GetOrganizationNonMasterAccount() {
        this.arn = null;
        this.email = null;
        this.id = null;
        this.name = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationNonMasterAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String email;
        private String id;
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationNonMasterAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetOrganizationNonMasterAccount build() {
            return new GetOrganizationNonMasterAccount(arn, email, id, name, status);
        }
    }
}
