// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Fields specific for BigQuery routines.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs Empty = new GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs();

    /**
     * Paths of the imported libraries.
     * 
     */
    @InputImport(name="importedLibraries")
      private final @Nullable Input<List<String>> importedLibraries;

    public Input<List<String>> getImportedLibraries() {
        return this.importedLibraries == null ? Input.empty() : this.importedLibraries;
    }

    public GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs(@Nullable Input<List<String>> importedLibraries) {
        this.importedLibraries = importedLibraries;
    }

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs() {
        this.importedLibraries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> importedLibraries;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importedLibraries = defaults.importedLibraries;
        }

        public Builder setImportedLibraries(@Nullable Input<List<String>> importedLibraries) {
            this.importedLibraries = importedLibraries;
            return this;
        }

        public Builder setImportedLibraries(@Nullable List<String> importedLibraries) {
            this.importedLibraries = Input.ofNullable(importedLibraries);
            return this;
        }
        public GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs build() {
            return new GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs(importedLibraries);
        }
    }
}
