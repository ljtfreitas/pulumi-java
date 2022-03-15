// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.outputs;

import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanNotificationTargetItem;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlanIncidentTemplate {
    /**
     * The deduplication string.
     * 
     */
    private final @Nullable String dedupeString;
    /**
     * The impact value.
     * 
     */
    private final Integer impact;
    /**
     * The list of notification targets.
     * 
     */
    private final @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets;
    /**
     * The summary string.
     * 
     */
    private final @Nullable String summary;
    /**
     * The title string.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private ResponsePlanIncidentTemplate(
        @CustomType.Parameter("dedupeString") @Nullable String dedupeString,
        @CustomType.Parameter("impact") Integer impact,
        @CustomType.Parameter("notificationTargets") @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets,
        @CustomType.Parameter("summary") @Nullable String summary,
        @CustomType.Parameter("title") String title) {
        this.dedupeString = dedupeString;
        this.impact = impact;
        this.notificationTargets = notificationTargets;
        this.summary = summary;
        this.title = title;
    }

    /**
     * The deduplication string.
     * 
    */
    public Optional<String> getDedupeString() {
        return Optional.ofNullable(this.dedupeString);
    }
    /**
     * The impact value.
     * 
    */
    public Integer getImpact() {
        return this.impact;
    }
    /**
     * The list of notification targets.
     * 
    */
    public List<ResponsePlanNotificationTargetItem> getNotificationTargets() {
        return this.notificationTargets == null ? List.of() : this.notificationTargets;
    }
    /**
     * The summary string.
     * 
    */
    public Optional<String> getSummary() {
        return Optional.ofNullable(this.summary);
    }
    /**
     * The title string.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanIncidentTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dedupeString;
        private Integer impact;
        private @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets;
        private @Nullable String summary;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanIncidentTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedupeString = defaults.dedupeString;
    	      this.impact = defaults.impact;
    	      this.notificationTargets = defaults.notificationTargets;
    	      this.summary = defaults.summary;
    	      this.title = defaults.title;
        }

        public Builder dedupeString(@Nullable String dedupeString) {
            this.dedupeString = dedupeString;
            return this;
        }

        public Builder impact(Integer impact) {
            this.impact = Objects.requireNonNull(impact);
            return this;
        }

        public Builder notificationTargets(@Nullable List<ResponsePlanNotificationTargetItem> notificationTargets) {
            this.notificationTargets = notificationTargets;
            return this;
        }

        public Builder summary(@Nullable String summary) {
            this.summary = summary;
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public ResponsePlanIncidentTemplate build() {
            return new ResponsePlanIncidentTemplate(dedupeString, impact, notificationTargets, summary, title);
        }
    }
}
