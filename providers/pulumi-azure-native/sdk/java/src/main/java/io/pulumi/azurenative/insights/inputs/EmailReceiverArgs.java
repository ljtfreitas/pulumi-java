// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An email receiver.
 * 
 */
public final class EmailReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailReceiverArgs Empty = new EmailReceiverArgs();

    /**
     * The email address of this receiver.
     * 
     */
    @InputImport(name="emailAddress", required=true)
        private final Input<String> emailAddress;

    public Input<String> getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the email receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @InputImport(name="useCommonAlertSchema")
        private final @Nullable Input<Boolean> useCommonAlertSchema;

    public Input<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Input.empty() : this.useCommonAlertSchema;
    }

    public EmailReceiverArgs(
        Input<String> emailAddress,
        Input<String> name,
        @Nullable Input<Boolean> useCommonAlertSchema) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? Input.ofNullable(false) : useCommonAlertSchema;
    }

    private EmailReceiverArgs() {
        this.emailAddress = Input.empty();
        this.name = Input.empty();
        this.useCommonAlertSchema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> emailAddress;
        private Input<String> name;
        private @Nullable Input<Boolean> useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setEmailAddress(Input<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Input.of(Objects.requireNonNull(emailAddress));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Input<Boolean> useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = Input.ofNullable(useCommonAlertSchema);
            return this;
        }
        public EmailReceiverArgs build() {
            return new EmailReceiverArgs(emailAddress, name, useCommonAlertSchema);
        }
    }
}
