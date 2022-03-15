// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashPackagePeriodTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashPackageSegmentTemplateFormat;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationDashEncryption;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationDashManifest;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 * 
 */
public final class PackagingConfigurationDashPackage extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationDashPackage Empty = new PackagingConfigurationDashPackage();

    /**
     * A list of DASH manifest configurations.
     * 
     */
    @Import(name="dashManifests", required=true)
      private final List<PackagingConfigurationDashManifest> dashManifests;

    public List<PackagingConfigurationDashManifest> getDashManifests() {
        return this.dashManifests;
    }

    @Import(name="encryption")
      private final @Nullable PackagingConfigurationDashEncryption encryption;

    public Optional<PackagingConfigurationDashEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     */
    @Import(name="includeEncoderConfigurationInSegments")
      private final @Nullable Boolean includeEncoderConfigurationInSegments;

    public Optional<Boolean> getIncludeEncoderConfigurationInSegments() {
        return this.includeEncoderConfigurationInSegments == null ? Optional.empty() : Optional.ofNullable(this.includeEncoderConfigurationInSegments);
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into more than one period. If the list contains "ADS", new periods will be created where the Asset contains SCTE-35 ad markers.
     * 
     */
    @Import(name="periodTriggers")
      private final @Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers;

    public List<PackagingConfigurationDashPackagePeriodTriggersItem> getPeriodTriggers() {
        return this.periodTriggers == null ? List.of() : this.periodTriggers;
    }

    @Import(name="segmentDurationSeconds")
      private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     */
    @Import(name="segmentTemplateFormat")
      private final @Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat;

    public Optional<PackagingConfigurationDashPackageSegmentTemplateFormat> getSegmentTemplateFormat() {
        return this.segmentTemplateFormat == null ? Optional.empty() : Optional.ofNullable(this.segmentTemplateFormat);
    }

    public PackagingConfigurationDashPackage(
        List<PackagingConfigurationDashManifest> dashManifests,
        @Nullable PackagingConfigurationDashEncryption encryption,
        @Nullable Boolean includeEncoderConfigurationInSegments,
        @Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers,
        @Nullable Integer segmentDurationSeconds,
        @Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat) {
        this.dashManifests = Objects.requireNonNull(dashManifests, "expected parameter 'dashManifests' to be non-null");
        this.encryption = encryption;
        this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
        this.periodTriggers = periodTriggers;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentTemplateFormat = segmentTemplateFormat;
    }

    private PackagingConfigurationDashPackage() {
        this.dashManifests = List.of();
        this.encryption = null;
        this.includeEncoderConfigurationInSegments = null;
        this.periodTriggers = List.of();
        this.segmentDurationSeconds = null;
        this.segmentTemplateFormat = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PackagingConfigurationDashManifest> dashManifests;
        private @Nullable PackagingConfigurationDashEncryption encryption;
        private @Nullable Boolean includeEncoderConfigurationInSegments;
        private @Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashManifests = defaults.dashManifests;
    	      this.encryption = defaults.encryption;
    	      this.includeEncoderConfigurationInSegments = defaults.includeEncoderConfigurationInSegments;
    	      this.periodTriggers = defaults.periodTriggers;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.segmentTemplateFormat = defaults.segmentTemplateFormat;
        }

        public Builder dashManifests(List<PackagingConfigurationDashManifest> dashManifests) {
            this.dashManifests = Objects.requireNonNull(dashManifests);
            return this;
        }

        public Builder encryption(@Nullable PackagingConfigurationDashEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder includeEncoderConfigurationInSegments(@Nullable Boolean includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
            return this;
        }

        public Builder periodTriggers(@Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers) {
            this.periodTriggers = periodTriggers;
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder segmentTemplateFormat(@Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }
        public PackagingConfigurationDashPackage build() {
            return new PackagingConfigurationDashPackage(dashManifests, encryption, includeEncoderConfigurationInSegments, periodTriggers, segmentDurationSeconds, segmentTemplateFormat);
        }
    }
}
