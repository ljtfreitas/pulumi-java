// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPosixProfileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPosixProfileGetArgs Empty = new UserPosixProfileGetArgs();

    /**
     * The POSIX group ID used for all EFS operations by this user.
     * 
     */
    @Import(name="gid", required=true)
      private final Output<Integer> gid;

    public Output<Integer> getGid() {
        return this.gid;
    }

    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     * 
     */
    @Import(name="secondaryGids")
      private final @Nullable Output<List<Integer>> secondaryGids;

    public Output<List<Integer>> getSecondaryGids() {
        return this.secondaryGids == null ? Output.empty() : this.secondaryGids;
    }

    /**
     * The POSIX user ID used for all EFS operations by this user.
     * 
     */
    @Import(name="uid", required=true)
      private final Output<Integer> uid;

    public Output<Integer> getUid() {
        return this.uid;
    }

    public UserPosixProfileGetArgs(
        Output<Integer> gid,
        @Nullable Output<List<Integer>> secondaryGids,
        Output<Integer> uid) {
        this.gid = Objects.requireNonNull(gid, "expected parameter 'gid' to be non-null");
        this.secondaryGids = secondaryGids;
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private UserPosixProfileGetArgs() {
        this.gid = Output.empty();
        this.secondaryGids = Output.empty();
        this.uid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPosixProfileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> gid;
        private @Nullable Output<List<Integer>> secondaryGids;
        private Output<Integer> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPosixProfileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        public Builder gid(Output<Integer> gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }

        public Builder gid(Integer gid) {
            this.gid = Output.of(Objects.requireNonNull(gid));
            return this;
        }

        public Builder secondaryGids(@Nullable Output<List<Integer>> secondaryGids) {
            this.secondaryGids = secondaryGids;
            return this;
        }

        public Builder secondaryGids(@Nullable List<Integer> secondaryGids) {
            this.secondaryGids = Output.ofNullable(secondaryGids);
            return this;
        }

        public Builder uid(Output<Integer> uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder uid(Integer uid) {
            this.uid = Output.of(Objects.requireNonNull(uid));
            return this;
        }
        public UserPosixProfileGetArgs build() {
            return new UserPosixProfileGetArgs(gid, secondaryGids, uid);
        }
    }
}
