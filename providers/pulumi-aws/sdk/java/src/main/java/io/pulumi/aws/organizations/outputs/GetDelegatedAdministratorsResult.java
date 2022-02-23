// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsDelegatedAdministrator;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDelegatedAdministratorsResult {
    /**
     * The list of delegated administrators in your organization, which have the following attributes:
     * 
     */
    private final List<GetDelegatedAdministratorsDelegatedAdministrator> delegatedAdministrators;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String servicePrincipal;

    @OutputCustomType.Constructor({"delegatedAdministrators","id","servicePrincipal"})
    private GetDelegatedAdministratorsResult(
        List<GetDelegatedAdministratorsDelegatedAdministrator> delegatedAdministrators,
        String id,
        @Nullable String servicePrincipal) {
        this.delegatedAdministrators = Objects.requireNonNull(delegatedAdministrators);
        this.id = Objects.requireNonNull(id);
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * The list of delegated administrators in your organization, which have the following attributes:
     * 
     */
    public List<GetDelegatedAdministratorsDelegatedAdministrator> getDelegatedAdministrators() {
        return this.delegatedAdministrators;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<String> getServicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDelegatedAdministratorsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDelegatedAdministratorsDelegatedAdministrator> delegatedAdministrators;
        private String id;
        private @Nullable String servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDelegatedAdministratorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegatedAdministrators = defaults.delegatedAdministrators;
    	      this.id = defaults.id;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder setDelegatedAdministrators(List<GetDelegatedAdministratorsDelegatedAdministrator> delegatedAdministrators) {
            this.delegatedAdministrators = Objects.requireNonNull(delegatedAdministrators);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setServicePrincipal(@Nullable String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public GetDelegatedAdministratorsResult build() {
            return new GetDelegatedAdministratorsResult(delegatedAdministrators, id, servicePrincipal);
        }
    }
}
