// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccessPointPosixUser {
    /**
     * The POSIX group ID used for all file system operations using this access point.
     * 
     */
    private final String gid;
    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * 
     */
    private final @Nullable List<String> secondaryGids;
    /**
     * The POSIX user ID used for all file system operations using this access point.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private AccessPointPosixUser(
        @CustomType.Parameter("gid") String gid,
        @CustomType.Parameter("secondaryGids") @Nullable List<String> secondaryGids,
        @CustomType.Parameter("uid") String uid) {
        this.gid = gid;
        this.secondaryGids = secondaryGids;
        this.uid = uid;
    }

    /**
     * The POSIX group ID used for all file system operations using this access point.
     * 
    */
    public String getGid() {
        return this.gid;
    }
    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * 
    */
    public List<String> getSecondaryGids() {
        return this.secondaryGids == null ? List.of() : this.secondaryGids;
    }
    /**
     * The POSIX user ID used for all file system operations using this access point.
     * 
    */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPosixUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gid;
        private @Nullable List<String> secondaryGids;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPosixUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        public Builder gid(String gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }

        public Builder secondaryGids(@Nullable List<String> secondaryGids) {
            this.secondaryGids = secondaryGids;
            return this;
        }

        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public AccessPointPosixUser build() {
            return new AccessPointPosixUser(gid, secondaryGids, uid);
        }
    }
}
