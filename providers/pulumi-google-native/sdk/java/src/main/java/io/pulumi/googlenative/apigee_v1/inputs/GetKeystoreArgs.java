// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeystoreArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKeystoreArgs Empty = new GetKeystoreArgs();

    @Import(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @Import(name="keystoreId", required=true)
      private final String keystoreId;

    public String getKeystoreId() {
        return this.keystoreId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetKeystoreArgs(
        String environmentId,
        String keystoreId,
        String organizationId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.keystoreId = Objects.requireNonNull(keystoreId, "expected parameter 'keystoreId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetKeystoreArgs() {
        this.environmentId = null;
        this.keystoreId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeystoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentId;
        private String keystoreId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeystoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.keystoreId = defaults.keystoreId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder keystoreId(String keystoreId) {
            this.keystoreId = Objects.requireNonNull(keystoreId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetKeystoreArgs build() {
            return new GetKeystoreArgs(environmentId, keystoreId, organizationId);
        }
    }
}
