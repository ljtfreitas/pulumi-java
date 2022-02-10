// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.BlobStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.EventHubStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.IoTHubStreamInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamInputPropertiesResponse {
    private final @Nullable Object datasource;
    private final DiagnosticsResponse diagnostics;
    private final String etag;
    private final @Nullable Object serialization;
    private final String type;

    @OutputCustomType.Constructor({"datasource","diagnostics","etag","serialization","type"})
    private StreamInputPropertiesResponse(
        @Nullable Object datasource,
        DiagnosticsResponse diagnostics,
        String etag,
        @Nullable Object serialization,
        String type) {
        this.datasource = datasource;
        this.diagnostics = Objects.requireNonNull(diagnostics);
        this.etag = Objects.requireNonNull(etag);
        this.serialization = serialization;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getDatasource() {
        return Optional.ofNullable(this.datasource);
    }
    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<Object> getSerialization() {
        return Optional.ofNullable(this.serialization);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamInputPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamInputPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDiagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public StreamInputPropertiesResponse build() {
            return new StreamInputPropertiesResponse(datasource, diagnostics, etag, serialization, type);
        }
    }
}