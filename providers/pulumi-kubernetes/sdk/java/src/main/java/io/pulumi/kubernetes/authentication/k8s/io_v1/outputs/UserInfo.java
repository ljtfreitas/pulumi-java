// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserInfo {
    /**
     * Any additional information provided by the authenticator.
     * 
     */
    private final @Nullable Map<String,List<String>> extra;
    /**
     * The names of groups this user is a part of.
     * 
     */
    private final @Nullable List<String> groups;
    /**
     * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
     * 
     */
    private final @Nullable String uid;
    /**
     * The name that uniquely identifies this user among all active users.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private UserInfo(
        @CustomType.Parameter("extra") @Nullable Map<String,List<String>> extra,
        @CustomType.Parameter("groups") @Nullable List<String> groups,
        @CustomType.Parameter("uid") @Nullable String uid,
        @CustomType.Parameter("username") @Nullable String username) {
        this.extra = extra;
        this.groups = groups;
        this.uid = uid;
        this.username = username;
    }

    /**
     * Any additional information provided by the authenticator.
     * 
    */
    public Map<String,List<String>> getExtra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    /**
     * The names of groups this user is a part of.
     * 
    */
    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
     * 
    */
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * The name that uniquely identifies this user among all active users.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private @Nullable String uid;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.uid = defaults.uid;
    	      this.username = defaults.username;
        }

        public Builder extra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder groups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public UserInfo build() {
            return new UserInfo(extra, groups, uid, username);
        }
    }
}
