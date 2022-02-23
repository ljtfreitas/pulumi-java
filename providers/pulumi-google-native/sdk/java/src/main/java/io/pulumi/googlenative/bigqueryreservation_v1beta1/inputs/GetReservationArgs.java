// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="reservationId", required=true)
      private final String reservationId;

    public String getReservationId() {
        return this.reservationId;
    }

    public GetReservationArgs(
        String location,
        @Nullable String project,
        String reservationId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.reservationId = Objects.requireNonNull(reservationId, "expected parameter 'reservationId' to be non-null");
    }

    private GetReservationArgs() {
        this.location = null;
        this.project = null;
        this.reservationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String reservationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.reservationId = defaults.reservationId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }
        public GetReservationArgs build() {
            return new GetReservationArgs(location, project, reservationId);
        }
    }
}
