// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs Empty = new WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs();

    /**
     * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
     * 
     */
    @InputImport(name="data")
    private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    /**
     * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs(
        @Nullable Input<String> data,
        Input<String> type) {
        this.data = data;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs() {
        this.data = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> data;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs(data, type);
        }
    }
}
