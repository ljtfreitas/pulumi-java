// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs Empty = new WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs();

    /**
     * The label string.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The value of the custom header.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs(
        Input<String> name,
        Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs defaults) {
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
        public WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs build() {
            return new WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs(name, value);
        }
    }
}
