// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetExcelOptions extends io.pulumi.resources.InvokeArgs {

    public static final DatasetExcelOptions Empty = new DatasetExcelOptions();

    @Import(name="headerRow")
      private final @Nullable Boolean headerRow;

    public Optional<Boolean> getHeaderRow() {
        return this.headerRow == null ? Optional.empty() : Optional.ofNullable(this.headerRow);
    }

    @Import(name="sheetIndexes")
      private final @Nullable List<Integer> sheetIndexes;

    public List<Integer> getSheetIndexes() {
        return this.sheetIndexes == null ? List.of() : this.sheetIndexes;
    }

    @Import(name="sheetNames")
      private final @Nullable List<String> sheetNames;

    public List<String> getSheetNames() {
        return this.sheetNames == null ? List.of() : this.sheetNames;
    }

    public DatasetExcelOptions(
        @Nullable Boolean headerRow,
        @Nullable List<Integer> sheetIndexes,
        @Nullable List<String> sheetNames) {
        this.headerRow = headerRow;
        this.sheetIndexes = sheetIndexes;
        this.sheetNames = sheetNames;
    }

    private DatasetExcelOptions() {
        this.headerRow = null;
        this.sheetIndexes = List.of();
        this.sheetNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetExcelOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean headerRow;
        private @Nullable List<Integer> sheetIndexes;
        private @Nullable List<String> sheetNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetExcelOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerRow = defaults.headerRow;
    	      this.sheetIndexes = defaults.sheetIndexes;
    	      this.sheetNames = defaults.sheetNames;
        }

        public Builder headerRow(@Nullable Boolean headerRow) {
            this.headerRow = headerRow;
            return this;
        }

        public Builder sheetIndexes(@Nullable List<Integer> sheetIndexes) {
            this.sheetIndexes = sheetIndexes;
            return this;
        }

        public Builder sheetNames(@Nullable List<String> sheetNames) {
            this.sheetNames = sheetNames;
            return this;
        }
        public DatasetExcelOptions build() {
            return new DatasetExcelOptions(headerRow, sheetIndexes, sheetNames);
        }
    }
}
