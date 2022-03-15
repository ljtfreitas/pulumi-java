// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LicenseArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FileOccurrence represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileOccurrenceArgs Empty = new FileOccurrenceArgs();

    /**
     * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    @Import(name="attributions")
      private final @Nullable Output<List<String>> attributions;

    public Output<List<String>> getAttributions() {
        return this.attributions == null ? Output.empty() : this.attributions;
    }

    /**
     * This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    @Import(name="contributors")
      private final @Nullable Output<List<String>> contributors;

    public Output<List<String>> getContributors() {
        return this.contributors == null ? Output.empty() : this.contributors;
    }

    /**
     * Identify the copyright holder of the file, as well as any dates present
     * 
     */
    @Import(name="copyright")
      private final @Nullable Output<String> copyright;

    public Output<String> getCopyright() {
        return this.copyright == null ? Output.empty() : this.copyright;
    }

    /**
     * This field contains the license information actually found in the file, if any
     * 
     */
    @Import(name="filesLicenseInfo")
      private final @Nullable Output<List<String>> filesLicenseInfo;

    public Output<List<String>> getFilesLicenseInfo() {
        return this.filesLicenseInfo == null ? Output.empty() : this.filesLicenseInfo;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    @Import(name="licenseConcluded")
      private final @Nullable Output<LicenseArgs> licenseConcluded;

    public Output<LicenseArgs> getLicenseConcluded() {
        return this.licenseConcluded == null ? Output.empty() : this.licenseConcluded;
    }

    /**
     * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    @Import(name="notice")
      private final @Nullable Output<String> notice;

    public Output<String> getNotice() {
        return this.notice == null ? Output.empty() : this.notice;
    }

    public FileOccurrenceArgs(
        @Nullable Output<List<String>> attributions,
        @Nullable Output<String> comment,
        @Nullable Output<List<String>> contributors,
        @Nullable Output<String> copyright,
        @Nullable Output<List<String>> filesLicenseInfo,
        @Nullable Output<String> id,
        @Nullable Output<LicenseArgs> licenseConcluded,
        @Nullable Output<String> notice) {
        this.attributions = attributions;
        this.comment = comment;
        this.contributors = contributors;
        this.copyright = copyright;
        this.filesLicenseInfo = filesLicenseInfo;
        this.id = id;
        this.licenseConcluded = licenseConcluded;
        this.notice = notice;
    }

    private FileOccurrenceArgs() {
        this.attributions = Output.empty();
        this.comment = Output.empty();
        this.contributors = Output.empty();
        this.copyright = Output.empty();
        this.filesLicenseInfo = Output.empty();
        this.id = Output.empty();
        this.licenseConcluded = Output.empty();
        this.notice = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> attributions;
        private @Nullable Output<String> comment;
        private @Nullable Output<List<String>> contributors;
        private @Nullable Output<String> copyright;
        private @Nullable Output<List<String>> filesLicenseInfo;
        private @Nullable Output<String> id;
        private @Nullable Output<LicenseArgs> licenseConcluded;
        private @Nullable Output<String> notice;

        public Builder() {
    	      // Empty
        }

        public Builder(FileOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributions = defaults.attributions;
    	      this.comment = defaults.comment;
    	      this.contributors = defaults.contributors;
    	      this.copyright = defaults.copyright;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.id = defaults.id;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.notice = defaults.notice;
        }

        public Builder attributions(@Nullable Output<List<String>> attributions) {
            this.attributions = attributions;
            return this;
        }

        public Builder attributions(@Nullable List<String> attributions) {
            this.attributions = Output.ofNullable(attributions);
            return this;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }

        public Builder contributors(@Nullable Output<List<String>> contributors) {
            this.contributors = contributors;
            return this;
        }

        public Builder contributors(@Nullable List<String> contributors) {
            this.contributors = Output.ofNullable(contributors);
            return this;
        }

        public Builder copyright(@Nullable Output<String> copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder copyright(@Nullable String copyright) {
            this.copyright = Output.ofNullable(copyright);
            return this;
        }

        public Builder filesLicenseInfo(@Nullable Output<List<String>> filesLicenseInfo) {
            this.filesLicenseInfo = filesLicenseInfo;
            return this;
        }

        public Builder filesLicenseInfo(@Nullable List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Output.ofNullable(filesLicenseInfo);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder licenseConcluded(@Nullable Output<LicenseArgs> licenseConcluded) {
            this.licenseConcluded = licenseConcluded;
            return this;
        }

        public Builder licenseConcluded(@Nullable LicenseArgs licenseConcluded) {
            this.licenseConcluded = Output.ofNullable(licenseConcluded);
            return this;
        }

        public Builder notice(@Nullable Output<String> notice) {
            this.notice = notice;
            return this;
        }

        public Builder notice(@Nullable String notice) {
            this.notice = Output.ofNullable(notice);
            return this;
        }
        public FileOccurrenceArgs build() {
            return new FileOccurrenceArgs(attributions, comment, contributors, copyright, filesLicenseInfo, id, licenseConcluded, notice);
        }
    }
}
