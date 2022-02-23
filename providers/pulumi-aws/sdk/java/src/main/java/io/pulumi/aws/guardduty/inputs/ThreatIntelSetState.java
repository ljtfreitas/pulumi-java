// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThreatIntelSetState extends io.pulumi.resources.ResourceArgs {

    public static final ThreatIntelSetState Empty = new ThreatIntelSetState();

    /**
     * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     */
    @InputImport(name="activate")
    private final @Nullable Input<Boolean> activate;

    public Input<Boolean> getActivate() {
        return this.activate == null ? Input.empty() : this.activate;
    }

    /**
     * Amazon Resource Name (ARN) of the GuardDuty ThreatIntelSet.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @InputImport(name="detectorId")
    private final @Nullable Input<String> detectorId;

    public Input<String> getDetectorId() {
        return this.detectorId == null ? Input.empty() : this.detectorId;
    }

    /**
     * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    @InputImport(name="format")
    private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * The URI of the file that contains the ThreatIntelSet.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The friendly name to identify the ThreatIntelSet.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ThreatIntelSetState(
        @Nullable Input<Boolean> activate,
        @Nullable Input<String> arn,
        @Nullable Input<String> detectorId,
        @Nullable Input<String> format,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.activate = activate;
        this.arn = arn;
        this.detectorId = detectorId;
        this.format = format;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ThreatIntelSetState() {
        this.activate = Input.empty();
        this.arn = Input.empty();
        this.detectorId = Input.empty();
        this.format = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreatIntelSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> activate;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> detectorId;
        private @Nullable Input<String> format;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ThreatIntelSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activate = defaults.activate;
    	      this.arn = defaults.arn;
    	      this.detectorId = defaults.detectorId;
    	      this.format = defaults.format;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setActivate(@Nullable Input<Boolean> activate) {
            this.activate = activate;
            return this;
        }

        public Builder setActivate(@Nullable Boolean activate) {
            this.activate = Input.ofNullable(activate);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDetectorId(@Nullable Input<String> detectorId) {
            this.detectorId = detectorId;
            return this;
        }

        public Builder setDetectorId(@Nullable String detectorId) {
            this.detectorId = Input.ofNullable(detectorId);
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ThreatIntelSetState build() {
            return new ThreatIntelSetState(activate, arn, detectorId, format, location, name, tags, tagsAll);
        }
    }
}