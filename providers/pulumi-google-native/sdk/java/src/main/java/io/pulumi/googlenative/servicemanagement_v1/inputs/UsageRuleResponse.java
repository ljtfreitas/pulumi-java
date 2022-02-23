// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Usage configuration rules for the service. NOTE: Under development. Use this rule to configure unregistered calls for the service. Unregistered calls are calls that do not contain consumer project identity. (Example: calls that do not contain an API key). By default, API methods do not allow unregistered calls, and each method call must be identified by a consumer project identity. Use this rule to allow/disallow unregistered calls. Example of an API that wants to allow unregistered calls for entire service. usage: rules: - selector: "*" allow_unregistered_calls: true Example of a method that wants to allow unregistered calls. usage: rules: - selector: "google.example.library.v1.LibraryService.CreateBook" allow_unregistered_calls: true
 * 
 */
public final class UsageRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final UsageRuleResponse Empty = new UsageRuleResponse();

    /**
     * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user or application.
     * 
     */
    @InputImport(name="allowUnregisteredCalls", required=true)
      private final Boolean allowUnregisteredCalls;

    public Boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls;
    }

    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector", required=true)
      private final String selector;

    public String getSelector() {
        return this.selector;
    }

    /**
     * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
     * 
     */
    @InputImport(name="skipServiceControl", required=true)
      private final Boolean skipServiceControl;

    public Boolean getSkipServiceControl() {
        return this.skipServiceControl;
    }

    public UsageRuleResponse(
        Boolean allowUnregisteredCalls,
        String selector,
        Boolean skipServiceControl) {
        this.allowUnregisteredCalls = Objects.requireNonNull(allowUnregisteredCalls, "expected parameter 'allowUnregisteredCalls' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.skipServiceControl = Objects.requireNonNull(skipServiceControl, "expected parameter 'skipServiceControl' to be non-null");
    }

    private UsageRuleResponse() {
        this.allowUnregisteredCalls = null;
        this.selector = null;
        this.skipServiceControl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowUnregisteredCalls;
        private String selector;
        private Boolean skipServiceControl;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUnregisteredCalls = defaults.allowUnregisteredCalls;
    	      this.selector = defaults.selector;
    	      this.skipServiceControl = defaults.skipServiceControl;
        }

        public Builder setAllowUnregisteredCalls(Boolean allowUnregisteredCalls) {
            this.allowUnregisteredCalls = Objects.requireNonNull(allowUnregisteredCalls);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSkipServiceControl(Boolean skipServiceControl) {
            this.skipServiceControl = Objects.requireNonNull(skipServiceControl);
            return this;
        }
        public UsageRuleResponse build() {
            return new UsageRuleResponse(allowUnregisteredCalls, selector, skipServiceControl);
        }
    }
}
