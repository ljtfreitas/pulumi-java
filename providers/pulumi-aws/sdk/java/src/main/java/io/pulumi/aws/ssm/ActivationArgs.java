// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivationArgs Empty = new ActivationArgs();

    /**
     * The description of the resource that you want to register.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @InputImport(name="expirationDate")
    private final @Nullable Input<String> expirationDate;

    public Input<String> getExpirationDate() {
        return this.expirationDate == null ? Input.empty() : this.expirationDate;
    }

    /**
     * The IAM Role to attach to the managed instance.
     * 
     */
    @InputImport(name="iamRole", required=true)
    private final Input<String> iamRole;

    public Input<String> getIamRole() {
        return this.iamRole;
    }

    /**
     * The default name of the registered managed instance.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    @InputImport(name="registrationLimit")
    private final @Nullable Input<Integer> registrationLimit;

    public Input<Integer> getRegistrationLimit() {
        return this.registrationLimit == null ? Input.empty() : this.registrationLimit;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ActivationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> expirationDate,
        Input<String> iamRole,
        @Nullable Input<String> name,
        @Nullable Input<Integer> registrationLimit,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.expirationDate = expirationDate;
        this.iamRole = Objects.requireNonNull(iamRole, "expected parameter 'iamRole' to be non-null");
        this.name = name;
        this.registrationLimit = registrationLimit;
        this.tags = tags;
    }

    private ActivationArgs() {
        this.description = Input.empty();
        this.expirationDate = Input.empty();
        this.iamRole = Input.empty();
        this.name = Input.empty();
        this.registrationLimit = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> expirationDate;
        private Input<String> iamRole;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> registrationLimit;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expirationDate = defaults.expirationDate;
    	      this.iamRole = defaults.iamRole;
    	      this.name = defaults.name;
    	      this.registrationLimit = defaults.registrationLimit;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpirationDate(@Nullable Input<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = Input.ofNullable(expirationDate);
            return this;
        }

        public Builder setIamRole(Input<String> iamRole) {
            this.iamRole = Objects.requireNonNull(iamRole);
            return this;
        }

        public Builder setIamRole(String iamRole) {
            this.iamRole = Input.of(Objects.requireNonNull(iamRole));
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

        public Builder setRegistrationLimit(@Nullable Input<Integer> registrationLimit) {
            this.registrationLimit = registrationLimit;
            return this;
        }

        public Builder setRegistrationLimit(@Nullable Integer registrationLimit) {
            this.registrationLimit = Input.ofNullable(registrationLimit);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ActivationArgs build() {
            return new ActivationArgs(description, expirationDate, iamRole, name, registrationLimit, tags);
        }
    }
}
