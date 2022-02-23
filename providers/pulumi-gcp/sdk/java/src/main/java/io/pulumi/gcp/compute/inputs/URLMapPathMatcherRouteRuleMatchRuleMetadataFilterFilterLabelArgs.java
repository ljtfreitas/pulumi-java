// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs Empty = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs();

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum
     * length of 1024 characters.
     * 
     */
    @InputImport(name="value", required=true)
        private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs(
        Input<String> name,
        Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs build() {
            return new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs(name, value);
        }
    }
}
