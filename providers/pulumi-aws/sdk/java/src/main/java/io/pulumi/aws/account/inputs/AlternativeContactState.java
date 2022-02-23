// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.account.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlternativeContactState extends io.pulumi.resources.ResourceArgs {

    public static final AlternativeContactState Empty = new AlternativeContactState();

    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     * 
     */
    @InputImport(name="accountId")
    private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     * 
     */
    @InputImport(name="alternateContactType")
    private final @Nullable Input<String> alternateContactType;

    public Input<String> getAlternateContactType() {
        return this.alternateContactType == null ? Input.empty() : this.alternateContactType;
    }

    /**
     * An email address for the alternate contact.
     * 
     */
    @InputImport(name="emailAddress")
    private final @Nullable Input<String> emailAddress;

    public Input<String> getEmailAddress() {
        return this.emailAddress == null ? Input.empty() : this.emailAddress;
    }

    /**
     * The name of the alternate contact.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A phone number for the alternate contact.
     * 
     */
    @InputImport(name="phoneNumber")
    private final @Nullable Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber == null ? Input.empty() : this.phoneNumber;
    }

    /**
     * A title for the alternate contact.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public AlternativeContactState(
        @Nullable Input<String> accountId,
        @Nullable Input<String> alternateContactType,
        @Nullable Input<String> emailAddress,
        @Nullable Input<String> name,
        @Nullable Input<String> phoneNumber,
        @Nullable Input<String> title) {
        this.accountId = accountId;
        this.alternateContactType = alternateContactType;
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

    private AlternativeContactState() {
        this.accountId = Input.empty();
        this.alternateContactType = Input.empty();
        this.emailAddress = Input.empty();
        this.name = Input.empty();
        this.phoneNumber = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlternativeContactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;
        private @Nullable Input<String> alternateContactType;
        private @Nullable Input<String> emailAddress;
        private @Nullable Input<String> name;
        private @Nullable Input<String> phoneNumber;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AlternativeContactState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.alternateContactType = defaults.alternateContactType;
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.title = defaults.title;
        }

        public Builder setAccountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
            return this;
        }

        public Builder setAlternateContactType(@Nullable Input<String> alternateContactType) {
            this.alternateContactType = alternateContactType;
            return this;
        }

        public Builder setAlternateContactType(@Nullable String alternateContactType) {
            this.alternateContactType = Input.ofNullable(alternateContactType);
            return this;
        }

        public Builder setEmailAddress(@Nullable Input<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = Input.ofNullable(emailAddress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPhoneNumber(@Nullable Input<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Input.ofNullable(phoneNumber);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public AlternativeContactState build() {
            return new AlternativeContactState(accountId, alternateContactType, emailAddress, name, phoneNumber, title);
        }
    }
}
