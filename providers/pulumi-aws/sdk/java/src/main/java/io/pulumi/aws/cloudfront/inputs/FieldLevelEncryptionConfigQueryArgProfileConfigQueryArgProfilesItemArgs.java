// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs();

    /**
     * ID of profile to use for field-level encryption query argument-profile mapping
     * 
     */
    @InputImport(name="profileId", required=true)
    private final Input<String> profileId;

    public Input<String> getProfileId() {
        return this.profileId;
    }

    /**
     * Query argument for field-level encryption query argument-profile mapping.
     * 
     */
    @InputImport(name="queryArg", required=true)
    private final Input<String> queryArg;

    public Input<String> getQueryArg() {
        return this.queryArg;
    }

    public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs(
        Input<String> profileId,
        Input<String> queryArg) {
        this.profileId = Objects.requireNonNull(profileId, "expected parameter 'profileId' to be non-null");
        this.queryArg = Objects.requireNonNull(queryArg, "expected parameter 'queryArg' to be non-null");
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs() {
        this.profileId = Input.empty();
        this.queryArg = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> profileId;
        private Input<String> queryArg;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileId = defaults.profileId;
    	      this.queryArg = defaults.queryArg;
        }

        public Builder setProfileId(Input<String> profileId) {
            this.profileId = Objects.requireNonNull(profileId);
            return this;
        }

        public Builder setProfileId(String profileId) {
            this.profileId = Input.of(Objects.requireNonNull(profileId));
            return this;
        }

        public Builder setQueryArg(Input<String> queryArg) {
            this.queryArg = Objects.requireNonNull(queryArg);
            return this;
        }

        public Builder setQueryArg(String queryArg) {
            this.queryArg = Input.of(Objects.requireNonNull(queryArg));
            return this;
        }
        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs(profileId, queryArg);
        }
    }
}
