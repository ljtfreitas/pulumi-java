// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.AppType;
import io.pulumi.azurenative.apimanagement.enums.Confirmation;
import io.pulumi.azurenative.apimanagement.enums.UserState;
import io.pulumi.azurenative.apimanagement.inputs.UserIdentityContractArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Determines the type of application which send the create user request. Default is legacy portal.
     * 
     */
    @InputImport(name="appType")
        private final @Nullable Input<Either<String,AppType>> appType;

    public Input<Either<String,AppType>> getAppType() {
        return this.appType == null ? Input.empty() : this.appType;
    }

    /**
     * Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    @InputImport(name="confirmation")
        private final @Nullable Input<Either<String,Confirmation>> confirmation;

    public Input<Either<String,Confirmation>> getConfirmation() {
        return this.confirmation == null ? Input.empty() : this.confirmation;
    }

    /**
     * Email address. Must not be empty and must be unique within the service instance.
     * 
     */
    @InputImport(name="email", required=true)
        private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * First name.
     * 
     */
    @InputImport(name="firstName", required=true)
        private final Input<String> firstName;

    public Input<String> getFirstName() {
        return this.firstName;
    }

    /**
     * Collection of user identities.
     * 
     */
    @InputImport(name="identities")
        private final @Nullable Input<List<UserIdentityContractArgs>> identities;

    public Input<List<UserIdentityContractArgs>> getIdentities() {
        return this.identities == null ? Input.empty() : this.identities;
    }

    /**
     * Last name.
     * 
     */
    @InputImport(name="lastName", required=true)
        private final Input<String> lastName;

    public Input<String> getLastName() {
        return this.lastName;
    }

    /**
     * Optional note about a user set by the administrator.
     * 
     */
    @InputImport(name="note")
        private final @Nullable Input<String> note;

    public Input<String> getNote() {
        return this.note == null ? Input.empty() : this.note;
    }

    /**
     * Send an Email notification to the User.
     * 
     */
    @InputImport(name="notify")
        private final @Nullable Input<Boolean> notify;

    public Input<Boolean> getNotify() {
        return this.notify == null ? Input.empty() : this.notify;
    }

    /**
     * User Password. If no value is provided, a default password is generated.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
        private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<Either<String,UserState>> state;

    public Input<Either<String,UserState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="userId")
        private final @Nullable Input<String> userId;

    public Input<String> getUserId() {
        return this.userId == null ? Input.empty() : this.userId;
    }

    public UserArgs(
        @Nullable Input<Either<String,AppType>> appType,
        @Nullable Input<Either<String,Confirmation>> confirmation,
        Input<String> email,
        Input<String> firstName,
        @Nullable Input<List<UserIdentityContractArgs>> identities,
        Input<String> lastName,
        @Nullable Input<String> note,
        @Nullable Input<Boolean> notify,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<Either<String,UserState>> state,
        @Nullable Input<String> userId) {
        this.appType = appType;
        this.confirmation = confirmation;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.firstName = Objects.requireNonNull(firstName, "expected parameter 'firstName' to be non-null");
        this.identities = identities;
        this.lastName = Objects.requireNonNull(lastName, "expected parameter 'lastName' to be non-null");
        this.note = note;
        this.notify = notify;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.state = state == null ? Input.ofLeft("active") : state;
        this.userId = userId;
    }

    private UserArgs() {
        this.appType = Input.empty();
        this.confirmation = Input.empty();
        this.email = Input.empty();
        this.firstName = Input.empty();
        this.identities = Input.empty();
        this.lastName = Input.empty();
        this.note = Input.empty();
        this.notify = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.state = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AppType>> appType;
        private @Nullable Input<Either<String,Confirmation>> confirmation;
        private Input<String> email;
        private Input<String> firstName;
        private @Nullable Input<List<UserIdentityContractArgs>> identities;
        private Input<String> lastName;
        private @Nullable Input<String> note;
        private @Nullable Input<Boolean> notify;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<Either<String,UserState>> state;
        private @Nullable Input<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appType = defaults.appType;
    	      this.confirmation = defaults.confirmation;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.identities = defaults.identities;
    	      this.lastName = defaults.lastName;
    	      this.note = defaults.note;
    	      this.notify = defaults.notify;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.userId = defaults.userId;
        }

        public Builder setAppType(@Nullable Input<Either<String,AppType>> appType) {
            this.appType = appType;
            return this;
        }

        public Builder setAppType(@Nullable Either<String,AppType> appType) {
            this.appType = Input.ofNullable(appType);
            return this;
        }

        public Builder setConfirmation(@Nullable Input<Either<String,Confirmation>> confirmation) {
            this.confirmation = confirmation;
            return this;
        }

        public Builder setConfirmation(@Nullable Either<String,Confirmation> confirmation) {
            this.confirmation = Input.ofNullable(confirmation);
            return this;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setFirstName(Input<String> firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = Input.of(Objects.requireNonNull(firstName));
            return this;
        }

        public Builder setIdentities(@Nullable Input<List<UserIdentityContractArgs>> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentities(@Nullable List<UserIdentityContractArgs> identities) {
            this.identities = Input.ofNullable(identities);
            return this;
        }

        public Builder setLastName(Input<String> lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = Input.of(Objects.requireNonNull(lastName));
            return this;
        }

        public Builder setNote(@Nullable Input<String> note) {
            this.note = note;
            return this;
        }

        public Builder setNote(@Nullable String note) {
            this.note = Input.ofNullable(note);
            return this;
        }

        public Builder setNotify(@Nullable Input<Boolean> notify) {
            this.notify = notify;
            return this;
        }

        public Builder setNotify(@Nullable Boolean notify) {
            this.notify = Input.ofNullable(notify);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,UserState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,UserState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setUserId(@Nullable Input<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserId(@Nullable String userId) {
            this.userId = Input.ofNullable(userId);
            return this;
        }
        public UserArgs build() {
            return new UserArgs(appType, confirmation, email, firstName, identities, lastName, note, notify, password, resourceGroupName, serviceName, state, userId);
        }
    }
}
