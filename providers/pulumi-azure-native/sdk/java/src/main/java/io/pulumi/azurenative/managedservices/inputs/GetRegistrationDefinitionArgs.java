// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegistrationDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistrationDefinitionArgs Empty = new GetRegistrationDefinitionArgs();

    @InputImport(name="registrationDefinitionId", required=true)
    private final String registrationDefinitionId;

    public String getRegistrationDefinitionId() {
        return this.registrationDefinitionId;
    }

    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetRegistrationDefinitionArgs(
        String registrationDefinitionId,
        String scope) {
        this.registrationDefinitionId = Objects.requireNonNull(registrationDefinitionId, "expected parameter 'registrationDefinitionId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRegistrationDefinitionArgs() {
        this.registrationDefinitionId = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registrationDefinitionId;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registrationDefinitionId = defaults.registrationDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder setRegistrationDefinitionId(String registrationDefinitionId) {
            this.registrationDefinitionId = Objects.requireNonNull(registrationDefinitionId);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetRegistrationDefinitionArgs build() {
            return new GetRegistrationDefinitionArgs(registrationDefinitionId, scope);
        }
    }
}