// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The user configuration. This is required only if QuickConnectType is USER.
 * 
 */
public final class QuickConnectUserQuickConnectConfig extends io.pulumi.resources.InvokeArgs {

    public static final QuickConnectUserQuickConnectConfig Empty = new QuickConnectUserQuickConnectConfig();

    @Import(name="contactFlowArn", required=true)
      private final String contactFlowArn;

    public String getContactFlowArn() {
        return this.contactFlowArn;
    }

    @Import(name="userArn", required=true)
      private final String userArn;

    public String getUserArn() {
        return this.userArn;
    }

    public QuickConnectUserQuickConnectConfig(
        String contactFlowArn,
        String userArn) {
        this.contactFlowArn = Objects.requireNonNull(contactFlowArn, "expected parameter 'contactFlowArn' to be non-null");
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private QuickConnectUserQuickConnectConfig() {
        this.contactFlowArn = null;
        this.userArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectUserQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowArn;
        private String userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectUserQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowArn = defaults.contactFlowArn;
    	      this.userArn = defaults.userArn;
        }

        public Builder contactFlowArn(String contactFlowArn) {
            this.contactFlowArn = Objects.requireNonNull(contactFlowArn);
            return this;
        }

        public Builder userArn(String userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }
        public QuickConnectUserQuickConnectConfig build() {
            return new QuickConnectUserQuickConnectConfig(contactFlowArn, userArn);
        }
    }
}
