// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.azurenative.elastic.inputs.CompanyInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User Information to be passed to partners.
 * 
 */
public final class UserInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserInfoArgs Empty = new UserInfoArgs();

    /**
     * Company information of the user to be passed to partners.
     * 
     */
    @Import(name="companyInfo")
      private final @Nullable Output<CompanyInfoArgs> companyInfo;

    public Output<CompanyInfoArgs> getCompanyInfo() {
        return this.companyInfo == null ? Output.empty() : this.companyInfo;
    }

    /**
     * Company name of the user
     * 
     */
    @Import(name="companyName")
      private final @Nullable Output<String> companyName;

    public Output<String> getCompanyName() {
        return this.companyName == null ? Output.empty() : this.companyName;
    }

    /**
     * Email of the user used by Elastic for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
      private final @Nullable Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress == null ? Output.empty() : this.emailAddress;
    }

    /**
     * First name of the user
     * 
     */
    @Import(name="firstName")
      private final @Nullable Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName == null ? Output.empty() : this.firstName;
    }

    /**
     * Last name of the user
     * 
     */
    @Import(name="lastName")
      private final @Nullable Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName == null ? Output.empty() : this.lastName;
    }

    public UserInfoArgs(
        @Nullable Output<CompanyInfoArgs> companyInfo,
        @Nullable Output<String> companyName,
        @Nullable Output<String> emailAddress,
        @Nullable Output<String> firstName,
        @Nullable Output<String> lastName) {
        this.companyInfo = companyInfo;
        this.companyName = companyName;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private UserInfoArgs() {
        this.companyInfo = Output.empty();
        this.companyName = Output.empty();
        this.emailAddress = Output.empty();
        this.firstName = Output.empty();
        this.lastName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CompanyInfoArgs> companyInfo;
        private @Nullable Output<String> companyName;
        private @Nullable Output<String> emailAddress;
        private @Nullable Output<String> firstName;
        private @Nullable Output<String> lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyInfo = defaults.companyInfo;
    	      this.companyName = defaults.companyName;
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
        }

        public Builder companyInfo(@Nullable Output<CompanyInfoArgs> companyInfo) {
            this.companyInfo = companyInfo;
            return this;
        }

        public Builder companyInfo(@Nullable CompanyInfoArgs companyInfo) {
            this.companyInfo = Output.ofNullable(companyInfo);
            return this;
        }

        public Builder companyName(@Nullable Output<String> companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder companyName(@Nullable String companyName) {
            this.companyName = Output.ofNullable(companyName);
            return this;
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = Output.ofNullable(emailAddress);
            return this;
        }

        public Builder firstName(@Nullable Output<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(@Nullable String firstName) {
            this.firstName = Output.ofNullable(firstName);
            return this;
        }

        public Builder lastName(@Nullable Output<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(@Nullable String lastName) {
            this.lastName = Output.ofNullable(lastName);
            return this;
        }
        public UserInfoArgs build() {
            return new UserInfoArgs(companyInfo, companyName, emailAddress, firstName, lastName);
        }
    }
}
