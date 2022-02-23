// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="reservation", required=true)
      private final String reservation;

    public String getReservation() {
        return this.reservation;
    }

    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetReservationArgs(
        @Nullable String project,
        String reservation,
        String zone) {
        this.project = project;
        this.reservation = Objects.requireNonNull(reservation, "expected parameter 'reservation' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetReservationArgs() {
        this.project = null;
        this.reservation = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String reservation;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.reservation = defaults.reservation;
    	      this.zone = defaults.zone;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setReservation(String reservation) {
            this.reservation = Objects.requireNonNull(reservation);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetReservationArgs build() {
            return new GetReservationArgs(project, reservation, zone);
        }
    }
}
