// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.AuthRequirementResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OAuthRequirementsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Authentication rules for the service. By default, if a method has any authentication requirements, every request must include a valid credential matching one of the requirements. It's an error to include more than one kind of credential in a single request. If a method doesn't have any auth requirements, request credentials will be ignored.
 * 
 */
public final class AuthenticationRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticationRuleResponse Empty = new AuthenticationRuleResponse();

    /**
     * If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
     * 
     */
    @Import(name="allowWithoutCredential", required=true)
      private final Boolean allowWithoutCredential;

    public Boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential;
    }

    /**
     * The requirements for OAuth credentials.
     * 
     */
    @Import(name="oauth", required=true)
      private final OAuthRequirementsResponse oauth;

    public OAuthRequirementsResponse getOauth() {
        return this.oauth;
    }

    /**
     * Requirements for additional authentication providers.
     * 
     */
    @Import(name="requirements", required=true)
      private final List<AuthRequirementResponse> requirements;

    public List<AuthRequirementResponse> getRequirements() {
        return this.requirements;
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector", required=true)
      private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public AuthenticationRuleResponse(
        Boolean allowWithoutCredential,
        OAuthRequirementsResponse oauth,
        List<AuthRequirementResponse> requirements,
        String selector) {
        this.allowWithoutCredential = Objects.requireNonNull(allowWithoutCredential, "expected parameter 'allowWithoutCredential' to be non-null");
        this.oauth = Objects.requireNonNull(oauth, "expected parameter 'oauth' to be non-null");
        this.requirements = Objects.requireNonNull(requirements, "expected parameter 'requirements' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private AuthenticationRuleResponse() {
        this.allowWithoutCredential = null;
        this.oauth = null;
        this.requirements = List.of();
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowWithoutCredential;
        private OAuthRequirementsResponse oauth;
        private List<AuthRequirementResponse> requirements;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowWithoutCredential = defaults.allowWithoutCredential;
    	      this.oauth = defaults.oauth;
    	      this.requirements = defaults.requirements;
    	      this.selector = defaults.selector;
        }

        public Builder allowWithoutCredential(Boolean allowWithoutCredential) {
            this.allowWithoutCredential = Objects.requireNonNull(allowWithoutCredential);
            return this;
        }

        public Builder oauth(OAuthRequirementsResponse oauth) {
            this.oauth = Objects.requireNonNull(oauth);
            return this;
        }

        public Builder requirements(List<AuthRequirementResponse> requirements) {
            this.requirements = Objects.requireNonNull(requirements);
            return this;
        }

        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public AuthenticationRuleResponse build() {
            return new AuthenticationRuleResponse(allowWithoutCredential, oauth, requirements, selector);
        }
    }
}
