// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    private final String apiManagementName;
    /**
     * @return The Email Address used for this User.
     * 
     */
    private final String email;
    /**
     * @return The First Name for the User.
     * 
     */
    private final String firstName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Last Name for the User.
     * 
     */
    private final String lastName;
    /**
     * @return Any notes about this User.
     * 
     */
    private final String note;
    private final String resourceGroupName;
    /**
     * @return The current state of this User, for example `active`, `blocked` or `pending`.
     * 
     */
    private final String state;
    private final String userId;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("apiManagementName") String apiManagementName,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("firstName") String firstName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastName") String lastName,
        @CustomType.Parameter("note") String note,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("userId") String userId) {
        this.apiManagementName = apiManagementName;
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.note = note;
        this.resourceGroupName = resourceGroupName;
        this.state = state;
        this.userId = userId;
    }

    public String apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * @return The Email Address used for this User.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The First Name for the User.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Last Name for the User.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return Any notes about this User.
     * 
     */
    public String note() {
        return this.note;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The current state of this User, for example `active`, `blocked` or `pending`.
     * 
     */
    public String state() {
        return this.state;
    }
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiManagementName;
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private String note;
        private String resourceGroupName;
        private String state;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiManagementName = defaults.apiManagementName;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.note = defaults.note;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.state = defaults.state;
    	      this.userId = defaults.userId;
        }

        public Builder apiManagementName(String apiManagementName) {
            this.apiManagementName = Objects.requireNonNull(apiManagementName);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder note(String note) {
            this.note = Objects.requireNonNull(note);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(apiManagementName, email, firstName, id, lastName, note, resourceGroupName, state, userId);
        }
    }
}
