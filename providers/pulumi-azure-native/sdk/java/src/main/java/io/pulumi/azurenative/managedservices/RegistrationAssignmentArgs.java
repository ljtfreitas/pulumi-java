// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.managedservices.inputs.RegistrationAssignmentPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistrationAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationAssignmentArgs Empty = new RegistrationAssignmentArgs();

    /**
     * Properties of a registration assignment.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<RegistrationAssignmentPropertiesArgs> properties;

    public Input<RegistrationAssignmentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Guid of the registration assignment.
     * 
     */
    @InputImport(name="registrationAssignmentId")
    private final @Nullable Input<String> registrationAssignmentId;

    public Input<String> getRegistrationAssignmentId() {
        return this.registrationAssignmentId == null ? Input.empty() : this.registrationAssignmentId;
    }

    /**
     * Scope of the resource.
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public RegistrationAssignmentArgs(
        @Nullable Input<RegistrationAssignmentPropertiesArgs> properties,
        @Nullable Input<String> registrationAssignmentId,
        Input<String> scope) {
        this.properties = properties;
        this.registrationAssignmentId = registrationAssignmentId;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RegistrationAssignmentArgs() {
        this.properties = Input.empty();
        this.registrationAssignmentId = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegistrationAssignmentPropertiesArgs> properties;
        private @Nullable Input<String> registrationAssignmentId;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.registrationAssignmentId = defaults.registrationAssignmentId;
    	      this.scope = defaults.scope;
        }

        public Builder setProperties(@Nullable Input<RegistrationAssignmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable RegistrationAssignmentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setRegistrationAssignmentId(@Nullable Input<String> registrationAssignmentId) {
            this.registrationAssignmentId = registrationAssignmentId;
            return this;
        }

        public Builder setRegistrationAssignmentId(@Nullable String registrationAssignmentId) {
            this.registrationAssignmentId = Input.ofNullable(registrationAssignmentId);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public RegistrationAssignmentArgs build() {
            return new RegistrationAssignmentArgs(properties, registrationAssignmentId, scope);
        }
    }
}
