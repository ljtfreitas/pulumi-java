// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLIPSetForwardedIPConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLIPSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLIPSetReferenceStatementArgs Empty = new WebACLIPSetReferenceStatementArgs();

    @InputImport(name="arn", required=true)
        private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    @InputImport(name="iPSetForwardedIPConfig")
        private final @Nullable Input<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig;

    public Input<WebACLIPSetForwardedIPConfigurationArgs> getIPSetForwardedIPConfig() {
        return this.iPSetForwardedIPConfig == null ? Input.empty() : this.iPSetForwardedIPConfig;
    }

    public WebACLIPSetReferenceStatementArgs(
        Input<String> arn,
        @Nullable Input<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
    }

    private WebACLIPSetReferenceStatementArgs() {
        this.arn = Input.empty();
        this.iPSetForwardedIPConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLIPSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLIPSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.iPSetForwardedIPConfig = defaults.iPSetForwardedIPConfig;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setIPSetForwardedIPConfig(@Nullable Input<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }

        public Builder setIPSetForwardedIPConfig(@Nullable WebACLIPSetForwardedIPConfigurationArgs iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = Input.ofNullable(iPSetForwardedIPConfig);
            return this;
        }
        public WebACLIPSetReferenceStatementArgs build() {
            return new WebACLIPSetReferenceStatementArgs(arn, iPSetForwardedIPConfig);
        }
    }
}
