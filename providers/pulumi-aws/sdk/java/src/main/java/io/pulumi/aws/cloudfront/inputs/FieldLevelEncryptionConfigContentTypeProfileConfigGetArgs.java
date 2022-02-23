// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs Empty = new FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs();

    /**
     * Object that contains an attribute `items` that contains the list of configurations for a field-level encryption content type-profile. See Content Type Profile.
     * 
     */
    @InputImport(name="contentTypeProfiles", required=true)
    private final Input<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs> contentTypeProfiles;

    public Input<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs> getContentTypeProfiles() {
        return this.contentTypeProfiles;
    }

    /**
     * specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown.
     * 
     */
    @InputImport(name="forwardWhenContentTypeIsUnknown", required=true)
    private final Input<Boolean> forwardWhenContentTypeIsUnknown;

    public Input<Boolean> getForwardWhenContentTypeIsUnknown() {
        return this.forwardWhenContentTypeIsUnknown;
    }

    public FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs(
        Input<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs> contentTypeProfiles,
        Input<Boolean> forwardWhenContentTypeIsUnknown) {
        this.contentTypeProfiles = Objects.requireNonNull(contentTypeProfiles, "expected parameter 'contentTypeProfiles' to be non-null");
        this.forwardWhenContentTypeIsUnknown = Objects.requireNonNull(forwardWhenContentTypeIsUnknown, "expected parameter 'forwardWhenContentTypeIsUnknown' to be non-null");
    }

    private FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs() {
        this.contentTypeProfiles = Input.empty();
        this.forwardWhenContentTypeIsUnknown = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs> contentTypeProfiles;
        private Input<Boolean> forwardWhenContentTypeIsUnknown;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypeProfiles = defaults.contentTypeProfiles;
    	      this.forwardWhenContentTypeIsUnknown = defaults.forwardWhenContentTypeIsUnknown;
        }

        public Builder setContentTypeProfiles(Input<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs> contentTypeProfiles) {
            this.contentTypeProfiles = Objects.requireNonNull(contentTypeProfiles);
            return this;
        }

        public Builder setContentTypeProfiles(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesGetArgs contentTypeProfiles) {
            this.contentTypeProfiles = Input.of(Objects.requireNonNull(contentTypeProfiles));
            return this;
        }

        public Builder setForwardWhenContentTypeIsUnknown(Input<Boolean> forwardWhenContentTypeIsUnknown) {
            this.forwardWhenContentTypeIsUnknown = Objects.requireNonNull(forwardWhenContentTypeIsUnknown);
            return this;
        }

        public Builder setForwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
            this.forwardWhenContentTypeIsUnknown = Input.of(Objects.requireNonNull(forwardWhenContentTypeIsUnknown));
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs(contentTypeProfiles, forwardWhenContentTypeIsUnknown);
        }
    }
}
