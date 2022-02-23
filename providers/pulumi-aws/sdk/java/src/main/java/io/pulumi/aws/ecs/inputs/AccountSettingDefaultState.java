// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountSettingDefaultState extends io.pulumi.resources.ResourceArgs {

    public static final AccountSettingDefaultState Empty = new AccountSettingDefaultState();

    /**
     * Name of the account setting to set. Valid values are `serviceLongArnFormat`, `taskLongArnFormat`, `containerInstanceLongArnFormat`, `awsvpcTrunking` and `containerInsights`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="principalArn")
    private final @Nullable Input<String> principalArn;

    public Input<String> getPrincipalArn() {
        return this.principalArn == null ? Input.empty() : this.principalArn;
    }

    /**
     * State of the setting. Valid values are `enabled` and `disabled`.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public AccountSettingDefaultState(
        @Nullable Input<String> name,
        @Nullable Input<String> principalArn,
        @Nullable Input<String> value) {
        this.name = name;
        this.principalArn = principalArn;
        this.value = value;
    }

    private AccountSettingDefaultState() {
        this.name = Input.empty();
        this.principalArn = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountSettingDefaultState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> principalArn;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountSettingDefaultState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.principalArn = defaults.principalArn;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrincipalArn(@Nullable Input<String> principalArn) {
            this.principalArn = principalArn;
            return this;
        }

        public Builder setPrincipalArn(@Nullable String principalArn) {
            this.principalArn = Input.ofNullable(principalArn);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public AccountSettingDefaultState build() {
            return new AccountSettingDefaultState(name, principalArn, value);
        }
    }
}
