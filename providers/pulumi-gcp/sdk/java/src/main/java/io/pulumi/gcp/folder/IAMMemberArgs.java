// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    @InputImport(name="condition")
        private final @Nullable Input<IAMMemberConditionArgs> condition;

    public Input<IAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="folder", required=true)
        private final Input<String> folder;

    public Input<String> getFolder() {
        return this.folder;
    }

    @InputImport(name="member", required=true)
        private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public IAMMemberArgs(
        @Nullable Input<IAMMemberConditionArgs> condition,
        Input<String> folder,
        Input<String> member,
        Input<String> role) {
        this.condition = condition;
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private IAMMemberArgs() {
        this.condition = Input.empty();
        this.folder = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IAMMemberConditionArgs> condition;
        private Input<String> folder;
        private Input<String> member;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.folder = defaults.folder;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<IAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable IAMMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setFolder(Input<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setFolder(String folder) {
            this.folder = Input.of(Objects.requireNonNull(folder));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public IAMMemberArgs build() {
            return new IAMMemberArgs(condition, folder, member, role);
        }
    }
}
