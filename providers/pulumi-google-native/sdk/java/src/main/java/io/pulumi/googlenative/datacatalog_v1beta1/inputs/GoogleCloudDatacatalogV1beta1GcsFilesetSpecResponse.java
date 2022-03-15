// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1GcsFileSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a Cloud Storage fileset entry.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse Empty = new GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse();

    /**
     * Patterns to identify a set of files in Google Cloud Storage. See [Cloud Storage documentation](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames) for more information. Note that bucket wildcards are currently not supported. Examples of valid file_patterns: * `gs://bucket_name/dir/*`: matches all files within `bucket_name/dir` directory. * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` spanning all subdirectories. * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to provide more powerful matches, for example: * `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    @Import(name="filePatterns", required=true)
      private final List<String> filePatterns;

    public List<String> getFilePatterns() {
        return this.filePatterns;
    }

    /**
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * 
     */
    @Import(name="sampleGcsFileSpecs", required=true)
      private final List<GoogleCloudDatacatalogV1beta1GcsFileSpecResponse> sampleGcsFileSpecs;

    public List<GoogleCloudDatacatalogV1beta1GcsFileSpecResponse> getSampleGcsFileSpecs() {
        return this.sampleGcsFileSpecs;
    }

    public GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse(
        List<String> filePatterns,
        List<GoogleCloudDatacatalogV1beta1GcsFileSpecResponse> sampleGcsFileSpecs) {
        this.filePatterns = Objects.requireNonNull(filePatterns, "expected parameter 'filePatterns' to be non-null");
        this.sampleGcsFileSpecs = Objects.requireNonNull(sampleGcsFileSpecs, "expected parameter 'sampleGcsFileSpecs' to be non-null");
    }

    private GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse() {
        this.filePatterns = List.of();
        this.sampleGcsFileSpecs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> filePatterns;
        private List<GoogleCloudDatacatalogV1beta1GcsFileSpecResponse> sampleGcsFileSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
    	      this.sampleGcsFileSpecs = defaults.sampleGcsFileSpecs;
        }

        public Builder filePatterns(List<String> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }

        public Builder sampleGcsFileSpecs(List<GoogleCloudDatacatalogV1beta1GcsFileSpecResponse> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = Objects.requireNonNull(sampleGcsFileSpecs);
            return this;
        }
        public GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1GcsFilesetSpecResponse(filePatterns, sampleGcsFileSpecs);
        }
    }
}
