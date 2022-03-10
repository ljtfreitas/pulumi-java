// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashPackagePeriodTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationDashPackageSegmentTemplateFormat;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashEncryption;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashManifest;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PackagingConfigurationDashPackage {
    /**
     * A list of DASH manifest configurations.
     * 
     */
    private final List<PackagingConfigurationDashManifest> dashManifests;
    private final @Nullable PackagingConfigurationDashEncryption encryption;
    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     */
    private final @Nullable Boolean includeEncoderConfigurationInSegments;
    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into more than one period. If the list contains "ADS", new periods will be created where the Asset contains SCTE-35 ad markers.
     * 
     */
    private final @Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers;
    private final @Nullable Integer segmentDurationSeconds;
    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     */
    private final @Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat;

    @OutputCustomType.Constructor
    private PackagingConfigurationDashPackage(
        @OutputCustomType.Parameter("dashManifests") List<PackagingConfigurationDashManifest> dashManifests,
        @OutputCustomType.Parameter("encryption") @Nullable PackagingConfigurationDashEncryption encryption,
        @OutputCustomType.Parameter("includeEncoderConfigurationInSegments") @Nullable Boolean includeEncoderConfigurationInSegments,
        @OutputCustomType.Parameter("periodTriggers") @Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers,
        @OutputCustomType.Parameter("segmentDurationSeconds") @Nullable Integer segmentDurationSeconds,
        @OutputCustomType.Parameter("segmentTemplateFormat") @Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat) {
        this.dashManifests = dashManifests;
        this.encryption = encryption;
        this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
        this.periodTriggers = periodTriggers;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentTemplateFormat = segmentTemplateFormat;
    }

    /**
     * A list of DASH manifest configurations.
     * 
    */
    public List<PackagingConfigurationDashManifest> getDashManifests() {
        return this.dashManifests;
    }
    public Optional<PackagingConfigurationDashEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
    */
    public Optional<Boolean> getIncludeEncoderConfigurationInSegments() {
        return Optional.ofNullable(this.includeEncoderConfigurationInSegments);
    }
    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into more than one period. If the list contains "ADS", new periods will be created where the Asset contains SCTE-35 ad markers.
     * 
    */
    public List<PackagingConfigurationDashPackagePeriodTriggersItem> getPeriodTriggers() {
        return this.periodTriggers == null ? List.of() : this.periodTriggers;
    }
    public Optional<Integer> getSegmentDurationSeconds() {
        return Optional.ofNullable(this.segmentDurationSeconds);
    }
    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD). When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs. When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
    */
    public Optional<PackagingConfigurationDashPackageSegmentTemplateFormat> getSegmentTemplateFormat() {
        return Optional.ofNullable(this.segmentTemplateFormat);
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

        public Builder setDashManifests(List<PackagingConfigurationDashManifest> dashManifests) {
            this.dashManifests = Objects.requireNonNull(dashManifests);
            return this;
        }

        public Builder setEncryption(@Nullable PackagingConfigurationDashEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setIncludeEncoderConfigurationInSegments(@Nullable Boolean includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
            return this;
        }

        public Builder setPeriodTriggers(@Nullable List<PackagingConfigurationDashPackagePeriodTriggersItem> periodTriggers) {
            this.periodTriggers = periodTriggers;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setSegmentTemplateFormat(@Nullable PackagingConfigurationDashPackageSegmentTemplateFormat segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }
        public PackagingConfigurationDashPackage build() {
            return new PackagingConfigurationDashPackage(dashManifests, encryption, includeEncoderConfigurationInSegments, periodTriggers, segmentDurationSeconds, segmentTemplateFormat);
        }
    }
}
