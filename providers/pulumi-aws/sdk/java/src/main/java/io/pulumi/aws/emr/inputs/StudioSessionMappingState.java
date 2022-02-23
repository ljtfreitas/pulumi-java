// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioSessionMappingState extends io.pulumi.resources.ResourceArgs {

    public static final StudioSessionMappingState Empty = new StudioSessionMappingState();

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @InputImport(name="identityId")
    private final @Nullable Input<String> identityId;

    public Input<String> getIdentityId() {
        return this.identityId == null ? Input.empty() : this.identityId;
    }

    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @InputImport(name="identityName")
    private final @Nullable Input<String> identityName;

    public Input<String> getIdentityName() {
        return this.identityName == null ? Input.empty() : this.identityName;
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @InputImport(name="identityType")
    private final @Nullable Input<String> identityType;

    public Input<String> getIdentityType() {
        return this.identityType == null ? Input.empty() : this.identityType;
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @InputImport(name="sessionPolicyArn")
    private final @Nullable Input<String> sessionPolicyArn;

    public Input<String> getSessionPolicyArn() {
        return this.sessionPolicyArn == null ? Input.empty() : this.sessionPolicyArn;
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @InputImport(name="studioId")
    private final @Nullable Input<String> studioId;

    public Input<String> getStudioId() {
        return this.studioId == null ? Input.empty() : this.studioId;
    }

    public StudioSessionMappingState(
        @Nullable Input<String> identityId,
        @Nullable Input<String> identityName,
        @Nullable Input<String> identityType,
        @Nullable Input<String> sessionPolicyArn,
        @Nullable Input<String> studioId) {
        this.identityId = identityId;
        this.identityName = identityName;
        this.identityType = identityType;
        this.sessionPolicyArn = sessionPolicyArn;
        this.studioId = studioId;
    }

    private StudioSessionMappingState() {
        this.identityId = Input.empty();
        this.identityName = Input.empty();
        this.identityType = Input.empty();
        this.sessionPolicyArn = Input.empty();
        this.studioId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioSessionMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityId;
        private @Nullable Input<String> identityName;
        private @Nullable Input<String> identityType;
        private @Nullable Input<String> sessionPolicyArn;
        private @Nullable Input<String> studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioSessionMappingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityId = defaults.identityId;
    	      this.identityName = defaults.identityName;
    	      this.identityType = defaults.identityType;
    	      this.sessionPolicyArn = defaults.sessionPolicyArn;
    	      this.studioId = defaults.studioId;
        }

        public Builder setIdentityId(@Nullable Input<String> identityId) {
            this.identityId = identityId;
            return this;
        }

        public Builder setIdentityId(@Nullable String identityId) {
            this.identityId = Input.ofNullable(identityId);
            return this;
        }

        public Builder setIdentityName(@Nullable Input<String> identityName) {
            this.identityName = identityName;
            return this;
        }

        public Builder setIdentityName(@Nullable String identityName) {
            this.identityName = Input.ofNullable(identityName);
            return this;
        }

        public Builder setIdentityType(@Nullable Input<String> identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setIdentityType(@Nullable String identityType) {
            this.identityType = Input.ofNullable(identityType);
            return this;
        }

        public Builder setSessionPolicyArn(@Nullable Input<String> sessionPolicyArn) {
            this.sessionPolicyArn = sessionPolicyArn;
            return this;
        }

        public Builder setSessionPolicyArn(@Nullable String sessionPolicyArn) {
            this.sessionPolicyArn = Input.ofNullable(sessionPolicyArn);
            return this;
        }

        public Builder setStudioId(@Nullable Input<String> studioId) {
            this.studioId = studioId;
            return this;
        }

        public Builder setStudioId(@Nullable String studioId) {
            this.studioId = Input.ofNullable(studioId);
            return this;
        }
        public StudioSessionMappingState build() {
            return new StudioSessionMappingState(identityId, identityName, identityType, sessionPolicyArn, studioId);
        }
    }
}
