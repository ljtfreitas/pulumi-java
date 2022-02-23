// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SystemParameterRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ### System parameter configuration A system parameter is a special kind of parameter defined by the API system, not by an individual API. It is typically mapped to an HTTP header and/or a URL query parameter. This configuration specifies which methods change the names of the system parameters.
 * 
 */
public final class SystemParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemParametersArgs Empty = new SystemParametersArgs();

    /**
     * Define system parameters. The parameters defined here will override the default parameters implemented by the system. If this field is missing from the service config, default system parameters will be used. Default system parameters and names is implementation-dependent. Example: define api key for all methods system_parameters rules: - selector: "*" parameters: - name: api_key url_query_parameter: api_key Example: define 2 api key names for a specific method. system_parameters rules: - selector: "/ListShelves" parameters: - name: api_key http_header: Api-Key1 - name: api_key http_header: Api-Key2 **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<SystemParameterRuleArgs>> rules;

    public Input<List<SystemParameterRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public SystemParametersArgs(@Nullable Input<List<SystemParameterRuleArgs>> rules) {
        this.rules = rules;
    }

    private SystemParametersArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SystemParameterRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable Input<List<SystemParameterRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<SystemParameterRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public SystemParametersArgs build() {
            return new SystemParametersArgs(rules);
        }
    }
}
