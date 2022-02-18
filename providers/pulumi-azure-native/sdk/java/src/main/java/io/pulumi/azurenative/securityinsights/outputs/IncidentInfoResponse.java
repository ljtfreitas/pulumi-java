// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IncidentInfoResponse {
    /**
     * Incident Id
     * 
     */
    private final @Nullable String incidentId;
    /**
     * Relation Name
     * 
     */
    private final @Nullable String relationName;
    /**
     * The severity of the incident
     * 
     */
    private final @Nullable String severity;
    /**
     * The title of the incident
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor({"incidentId","relationName","severity","title"})
    private IncidentInfoResponse(
        @Nullable String incidentId,
        @Nullable String relationName,
        @Nullable String severity,
        @Nullable String title) {
        this.incidentId = incidentId;
        this.relationName = relationName;
        this.severity = severity;
        this.title = title;
    }

    /**
     * Incident Id
     * 
     */
    public Optional<String> getIncidentId() {
        return Optional.ofNullable(this.incidentId);
    }
    /**
     * Relation Name
     * 
     */
    public Optional<String> getRelationName() {
        return Optional.ofNullable(this.relationName);
    }
    /**
     * The severity of the incident
     * 
     */
    public Optional<String> getSeverity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * The title of the incident
     * 
     */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String incidentId;
        private @Nullable String relationName;
        private @Nullable String severity;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentId = defaults.incidentId;
    	      this.relationName = defaults.relationName;
    	      this.severity = defaults.severity;
    	      this.title = defaults.title;
        }

        public Builder setIncidentId(@Nullable String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        public Builder setRelationName(@Nullable String relationName) {
            this.relationName = relationName;
            return this;
        }

        public Builder setSeverity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public IncidentInfoResponse build() {
            return new IncidentInfoResponse(incidentId, relationName, severity, title);
        }
    }
}
